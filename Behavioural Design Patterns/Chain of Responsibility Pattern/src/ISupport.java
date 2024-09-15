public abstract class ISupport {
    ISupport iSupport;
    public void setNextHandler(ISupport iSupport) {
       this.iSupport = iSupport;
    }
    public abstract void assistance(Request request);
    public ISupport getiSupport() {
        return iSupport;
    }
    public void setiSupport(ISupport iSupport) {
        this.iSupport = iSupport;
    }
}
