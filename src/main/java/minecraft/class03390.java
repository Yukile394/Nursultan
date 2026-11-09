package minecraft;

record class03390<T>(T value, long time) {

   class03390(T value, long time) {
      super();
      this.value = (T)value;
      this.time = time;
   }

   public long y() {
      return this.time;
   }

   public T N() {
      return this.value;
   }
}
