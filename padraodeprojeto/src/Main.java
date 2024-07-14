//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Obter a instância única do ConfigManager
        ConfigManager configManager = ConfigManager.getInstance();

        // Exibir as configurações iniciais
        System.out.println("Nome do App: " + configManager.getAppName());
        System.out.println("Versão do App: " + configManager.getAppVersion());

        // Modificar as configurações
        configManager.setAppName("MeuAppAtualizado");
        configManager.setAppVersion("2.0");

        // Obter a instância novamente e exibir as novas configurações
        ConfigManager anotherConfigManager = ConfigManager.getInstance();
        System.out.println("Nome do App Atualizado: " + anotherConfigManager.getAppName());
        System.out.println("Versão do App Atualizada: " + anotherConfigManager.getAppVersion());
    }
}