import com.amazonaws.auth.*;
import com.amazonaws.services.s3.*;
import com.amazonaws.services.s3.model.*;
import java.io.*;

public class S3Uploader {
    public static void uploadReportsToS3() {
        try {
            AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                .withCredentials(new InstanceProfileCredentialsProvider(false))
                .withRegion("ap-south-1")
                .build();

            File outputDir = new File("output");
            uploadDirectory(s3Client, "selenium-test-logs-kesava", outputDir, "");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void uploadDirectory(AmazonS3 s3Client, String bucketName, File dir, String prefix) {
        for (File file : dir.listFiles()) {
            if (file.isDirectory()) {
                uploadDirectory(s3Client, bucketName, file, prefix + file.getName() + "/");
            } else {
                s3Client.putObject(bucketName, prefix + file.getName(), file);
                System.out.println("Uploaded " + prefix + file.getName());
            }
        }
    }
}
