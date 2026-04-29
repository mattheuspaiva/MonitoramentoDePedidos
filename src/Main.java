import model.Cliente;
import model.Pedido;
import service.*;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Miquéias", "miqueias@email.com");

        Pedido pedido = new Pedido("PED-001", "CRIADO", cliente);

        pedido.adicionarObserver(new EmailService());
        pedido.adicionarObserver(new LogService());
        pedido.adicionarObserver(new DashboardService());
        pedido.adicionarObserver(new EstoqueService());
        pedido.adicionarObserver(new FaturamentoService());

        System.out.println("* Quando mudar para PAGO");
        pedido.atualizarStatus("PAGO");

        System.out.println("-------------------------------------------------------------------------");

        System.out.println("\n* Quando mudar para EM_SEPARACAO");
        pedido.atualizarStatus("EM_SEPARACAO");

        System.out.println("-------------------------------------------------------------------------");

        System.out.println("\n* Quando mudar para ENVIADO");
        pedido.atualizarStatus("ENVIADO");

        System.out.println("-------------------------------------------------------------------------");

        System.out.println("\n* Quando mudar para CANCELADO");
        pedido.atualizarStatus("CANCELADO");
    }
}