package Program;

public class MensajeLog {
    private String mensaje;
    private boolean isError;
    
    public MensajeLog(String mensaje, boolean isError) {
        this.mensaje = mensaje;
        this.isError = isError;
    }
    
    public MensajeLog(String mensaje) {
        this.mensaje = mensaje;
        this.isError = false;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public boolean isIsError() {
        return isError;
    }

    public void setIsError(boolean isError) {
        this.isError = isError;
    }
}
