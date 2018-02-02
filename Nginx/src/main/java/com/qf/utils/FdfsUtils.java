package com.qf.utils;

import java.io.IOException;

import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient1;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

public class FdfsUtils {
	// �������ٷ������Ŀͻ���
	private TrackerClient trackerClient;
	// ���Ӹ��ٷ�����
	private TrackerServer trackerServer;
	// �����洢������
	private StorageServer storageServer;
	// �����洢�ͻ���
	private StorageClient1 storageClient;
	private String conf;

	public FdfsUtils(String conf) {
		if (conf.startsWith("classpath")) {
			conf = conf.replace("classpath:", FdfsUtils.class.getResource("/").getPath());
		}
		try {
			ClientGlobal.init(conf);
			trackerClient = new TrackerClient();
			trackerServer = trackerClient.getConnection();
			storageClient = new StorageClient1(trackerServer, storageServer);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MyException e) {
			e.printStackTrace();
		}
	}

	// ʵ���ļ��ϴ�--�����ļ�·��
	public String uploadFile(String filepath, String extName) {
		try {
			return storageClient.upload_file1(filepath, extName, null);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MyException e) {
			e.printStackTrace();
		}
		return null;
	}

	// ʵ���ļ��ϴ�--�����ļ��ֽ�����
	public String uploadBytes(byte[] contents, String extName) {
		if (extName.lastIndexOf(".") > -1) {
			extName = extName.substring(extName.lastIndexOf(".") + 1);
		}
		try {
			return storageClient.upload_file1(contents, extName, null);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (MyException e) {
			e.printStackTrace();
		}
		return null;

	}

}
