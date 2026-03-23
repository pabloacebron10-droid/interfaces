package a03_a05;

public class NotificacionPush implements Notificable {
    @Override
    public void enviarNotificacion(){
        System.out.println("Esto es una notificación push");
    }
}
