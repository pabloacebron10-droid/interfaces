package a03_a05;

public class Main {
    public static void main(String[] args) {
        
        Notificable email  = new NotificacionEmail();
        Notificable push = new NotificacionPush();
        Notificable sms = new NotificacionSMS();

        Notificable [] notificaciones = { email, push, sms };

        for (Notificable notificacion : notificaciones ) {
            notificacion.enviarNotificacion();
        }

        Notificable paloma = new Notificable() {
            @Override
            public void enviarNotificacion(){
                System.out.println("Cucu, el CEO os saluda");
            }
        };  

        paloma.enviarNotificacion();
    }
}