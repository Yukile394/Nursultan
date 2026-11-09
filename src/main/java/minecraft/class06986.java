package minecraft;

record class06986<T>(T value, long expiresAfterTime) {
   private static final long L = -1L;

   class06986(T value, long expiresAfterTime) {
      super();
      this.value = (T)value;
      this.expiresAfterTime = expiresAfterTime;
   }

   public long y() {
      return this.expiresAfterTime;
   }

   public T N() {
      return this.value;
   }

   public boolean N(long var1) {
      return this.expiresAfterTime == -1L ? false : var1 >= this.expiresAfterTime;
   }
}
