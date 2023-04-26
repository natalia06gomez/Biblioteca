/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labiblioteca;

/**
 *
 * @author linan
 */
public class Labiblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Componente: Interfaz que define el comportamiento del recordatorio
interface Recordatorio {
    void enviarRecordatorio();
}

// Componente concreto: Implementación concreta del recordatorio
class RecordatorioDevolucion implements Recordatorio {
    @Override
    public void enviarRecordatorio() {
        System.out.println("Recordatorio de devolución enviado.");
    }
}

// Decorador abstracto: Clase abstracta que define la estructura base del decorador
abstract class DecoradorRecordatorio implements Recordatorio {
    protected Recordatorio recordatorio;

    public DecoradorRecordatorio(Recordatorio recordatorio) {
        this.recordatorio = recordatorio;
    }

    @Override
    public void enviarRecordatorio() {
        recordatorio.enviarRecordatorio();
    }
}

// Decorador concreto: Implementación concreta del decorador que agrega funcionalidad
class DecoradorNotificacion extends DecoradorRecordatorio {
    public DecoradorNotificacion(Recordatorio recordatorio) {
        super(recordatorio);
    }

    @Override
    public void enviarRecordatorio() {
        super.enviarRecordatorio();
        notificarPorNotificacion();
    }

    private void notificarPorNotificacion() {
        System.out.println("Notificación enviada a través de una aplicación de notificación.");
    }
}

// Decorador concreto: Implementación concreta del decorador que agrega funcionalidad
class DecoradorEmail extends DecoradorRecordatorio {
    public DecoradorEmail(Recordatorio recordatorio) {
        super(recordatorio);
    }

    @Override
    public void enviarRecordatorio() {
        super.enviarRecordatorio();
        notificarPorEmail();
    }

    private void notificarPorEmail() {
        System.out.println("Correo electrónico enviado a la dirección registrada del usuario.");
    }
}

// Decorador concreto: Implementación concreta del decorador que agrega funcionalidad
class DecoradorSMS extends DecoradorRecordatorio {
    public DecoradorSMS(Recordatorio recordatorio) {
        super(recordatorio);
    }

    @Override
    public void enviarRecordatorio() {
        super.enviarRecordatorio();
        notificarPorSMS();
    }

    private void notificarPorSMS() {
        System.out.println("Mensaje de texto (SMS) enviado al número de teléfono registrado del usuario.");
    }
}

    }
}

    
    

