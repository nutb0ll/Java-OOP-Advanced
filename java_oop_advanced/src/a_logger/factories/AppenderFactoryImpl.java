package a_logger.factories;


import a_logger.enums.ReportLevel;
import a_logger.interfaces.Appender;
import a_logger.interfaces.AppenderFactory;
import a_logger.interfaces.File;
import a_logger.interfaces.Layout;
import a_logger.models.FileAppender;
import a_logger.models.LogFile;

public class AppenderFactoryImpl implements AppenderFactory {

    private static final String MODELS_PATH = "a_logger.models.";

    @Override
    @SuppressWarnings("unchecked")
    public Appender createAppender(String[] params) throws ReflectiveOperationException {
        String appenderName = params[0];
        String layoutName = params[1];
        Class<Appender> appenderClass = (Class<Appender>) Class.forName(MODELS_PATH + appenderName);
        Class<Layout> layoutClass = (Class<Layout>) Class.forName(MODELS_PATH  + layoutName);
        Layout layout = layoutClass.getDeclaredConstructor().newInstance();
        Appender appender = appenderClass.getDeclaredConstructor(Layout.class).newInstance(layout);
        if (appender instanceof FileAppender) {
            File file = new LogFile();
            ((FileAppender) appender).setFile(file);
        }
        if (params.length > 2) {
            ReportLevel reportLevel = ReportLevel.valueOf(params[2]);
            appender.setReportLevel(reportLevel);
        }
        return appender;
}
    }
