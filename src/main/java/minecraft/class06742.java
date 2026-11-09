package minecraft;

public record class06742(class06889 start, class06889 end, int color, float width) implements class06730 {
   public static final float N = 3.0F;

   public int L() {
      return this.color;
   }

   public class06742(class06889 start, class06889 end, int color, float width) {
      super();
      this.start = start;
      this.end = end;
      this.color = color;
      this.width = width;
   }

   public float u() {
      return this.width;
   }

   public class06889 y() {
      return this.end;
   }

   @Override
   public void N(class06722 var1, float var2) {
      var1.N(this.start, this.end, class02566.N(this.color, var2), this.width);
   }

   public class06889 N() {
      return this.start;
   }
}
