package com.qf.test;

import java.io.IOException;

import org.csource.common.MyException;
import org.junit.Test;

import com.qf.utils.FdfsUtils;

public class Demo01 {
	public static void main(String[] args) throws IOException, MyException {
		// ClientGlobal.init("src/main/resources/fdfs_client.conf");
		// TrackerClient trackerClient = new TrackerClient();
		// TrackerServer server = trackerClient.getConnection();
		// StorageServer server2 = null;
		// StorageClient storageClient = new StorageClient(server, server2);
		// String[] strs = storageClient.upload_file("a.txt", "txt", null);
		// System.out.println(Arrays.toString(strs));
		System.out.println(new FdfsUtils("src/main/resources/fdfs_client.conf").uploadFile("b.txt", "txt"));
	}

	@Test
	public void test() {

	}

}
