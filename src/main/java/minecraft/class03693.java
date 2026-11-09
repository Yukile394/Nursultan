package minecraft;

record class03693(float previous, float current) implements class03664 {
   class03693(float previous, float current) {
      this.previous = previous;
      this.current = current;
   }

   public float y() {
      return this.current;
   }

   public float N() {
      return this.previous;
   }

   @Override
   public float method_48886(float var1) {
      return class04995.B(var1, this.previous, this.current);
   }
}
