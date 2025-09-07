package Main;

import Cliente.Cliente;
import Computador.Computador;
import Computador.HardwareBasico;
import Computador.MemoriaUSB;
import Computador.SistemaOperacional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int matricula = 1898;
        Computador pc1 = new Computador("Apple", matricula);
        Computador pc2 = new Computador("Samsung", matricula + 1234);
        Computador pc3 = new Computador("Dell", matricula + 5678);

        HardwareBasico processador1 = new HardwareBasico("Pentium Core i3", 2200);
        HardwareBasico processador2 = new HardwareBasico("Pentium Core i5", 3370);
        HardwareBasico processador3 = new HardwareBasico("Pentium Core i7", 4500);

        HardwareBasico memoria1 = new HardwareBasico("Memória RAM", 8);
        HardwareBasico memoria2 = new HardwareBasico("Memória RAM", 16);
        HardwareBasico memoria3 = new HardwareBasico("Memória RAM", 32);

        HardwareBasico hd1 = new HardwareBasico("HD", 500);
        HardwareBasico hd2 = new HardwareBasico("HD", 1000);
        HardwareBasico hd3 = new HardwareBasico("HD", 2000);

        MemoriaUSB usb1 = new MemoriaUSB("Pen Drive", 16);
        MemoriaUSB usb2 = new MemoriaUSB("Pen Drive", 32);
        MemoriaUSB usb3 = new MemoriaUSB("HD Externo", 1000);

        SistemaOperacional so1 = new SistemaOperacional("macOS Sequoia", 64);
        SistemaOperacional so2 = new SistemaOperacional("Windows 8", 64);
        SistemaOperacional so3 = new SistemaOperacional("Windows 10", 64);

        Cliente cliente1 = new Cliente("Laís", "123.456.789-00");

        System.out.println("Escolha quais computadores deseja comprar:");
        System.out.println("1 - Computador 1");
        System.out.println("2 - Computador 2");
        System.out.println("3 - Computador 3");
        Scanner scanner = new Scanner(System.in);
        int escolha = scanner.nextInt();
    }
}
