public class ConfigManager {
    // Instância única do Singleton
    private static ConfigManager instance;

    // Configurações de exemplo
    private String appName;
    private String appVersion;

    // Construtor privado para impedir instância externa
    private ConfigManager() {
        // Configurações padrão
        this.appName = "MeuApp";
        this.appVersion = "1.0";
    }

    // Método público estático para fornecer acesso à instância única
    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    // Métodos para acessar e modificar as configurações
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }
}