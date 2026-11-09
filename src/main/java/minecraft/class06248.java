package minecraft;

record class06248(class06267 contents, int left, int right) implements class00947 {

   public class06267 L() {
      return this.contents;
   }

   class06248(class06267 contents, int left, int right) {
      super();
      this.contents = contents;
      this.left = left;
      this.right = right;
   }

   public int i() {
      return this.right;
   }

   public int u() {
      return this.left;
   }

   public int y() {
      return this.right - this.left + 1;
   }

   @Override
   public class05247 N() {
      return new class06257(this);
   }

   @Override
   public class07948 N(class00912 var1) {
      return var1.N(this.N(), new class06235(this));
   }
}
