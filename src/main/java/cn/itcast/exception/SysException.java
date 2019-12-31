package cn.itcast.exception;

/**
 * 存储信息
 */
public class SysException extends Exception {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private String message;

    public SysException(String message) {
        this.message = message;
    }
}

