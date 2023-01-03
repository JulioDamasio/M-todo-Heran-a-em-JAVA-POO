
import java.util.Date;

public class App {

    public static void main(String[] args) {
        

    Vendedor v = new Vendedor();
    v.setNome("Marcio");
    v.setSalario(1000.0f);
    v.setCpf("123456708-89");
    v.setDataNascimento(new Date());
    v.setComissaoPorItem(10.0F);
    v.setTotalItensVendidos(10);

    System.out.println("O salário do vendedor é: " + v.calcularSalario());

    }
}
