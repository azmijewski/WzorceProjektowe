package singleton.log;



public class Log {
    private Level level;
    private String message;

    public Log(Level level, String message) {
        this.level = level;
        this.message = message;
    }

    @Override
    public String toString() {
        return "Log{" +
                "level=" + level +
                ", message='" + message + '\'' +
                '}';
    }
}
