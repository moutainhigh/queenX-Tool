package com.queen.core.api.crypto.exception;

/**
 * <p>加密数据失败异常</p>
 *
 */
public class EncryptBodyFailException extends RuntimeException {

	public EncryptBodyFailException() {
		super("Encrypted data failed. (加密数据失败)");
	}

	public EncryptBodyFailException(String message) {
		super(message);
	}
}
