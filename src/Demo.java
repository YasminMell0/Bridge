import devices.Device;
import devices.Radio;
import devices.Tv;
import remotes.AdvancedRemote;
import remotes.BasicRemote;

public class Demo {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}

/*
Essa aplicação simula o controle de dispositivos eletrônicos, como TVs e rádios, usando o padrão de projeto Bridge, 
que separa a abstração da implementação. A implementação consiste em três partes principais: dispositivos, controles 
remotos e uma classe de demonstração. Isso mostra como o padrão Bridge permite que o código seja facilmente escalável 
e flexível, separando a implementação dos dispositivos dos controles remotos que os manipulam.


Interface Device:
A interface Device define os métodos que qualquer dispositivo eletrônico deve implementar, como ligar/desligar, ajustar 
volume e canal, e exibir o status atual.


Interface Remote:
Essa interface define o controle remoto, que pode controlar o dispositivo através de métodos como ligar/desligar, ajustar
volume (para cima ou para baixo) e mudar de canal (para cima ou para baixo).


Classe Demo:
A classe Demo demonstra o funcionamento do sistema. Ela cria uma TV e um rádio, e depois testa cada dispositivo usando dois
tipos de controle remoto: o básico (BasicRemote) e o avançado (AdvancedRemote). Para cada dispositivo, o sistema:

    Usa o controle remoto básico para ligar/desligar e exibir o status.
    Usa o controle remoto avançado para ligar/desligar, silenciar e exibir o status atualizado.


Funcionamento:
    Inicialmente, a aplicação testa uma TV e um rádio.
    Para cada dispositivo, o controle remoto básico é usado para ligar o dispositivo e o status atual é impresso.
    O controle remoto avançado, por sua vez, também liga/desliga o dispositivo, mas adiciona a função de silenciar
    (definindo o volume para 0).
*/
