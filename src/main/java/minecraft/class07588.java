package minecraft;

record class07588(float a, float b, float c) {
   public float L() {
      return this.c;
   }

   class07588(float a, float b, float c) {
      super();
      this.a = a;
      this.b = b;
      this.c = c;
   }

   public float y(float var1) {
      return (3.0F * this.a * var1 + 2.0F * this.b) * var1 + this.c;
   }

   public float y() {
      return this.b;
   }

   public float N() {
      return this.a;
   }

   public float N(float var1) {
      return ((this.a * var1 + this.b) * var1 + this.c) * var1;
   }
}
