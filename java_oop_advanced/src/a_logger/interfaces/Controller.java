package a_logger.interfaces;

public interface Controller {

    void log(String[] args) throws ReflectiveOperationException;

    String getLogs();
}
