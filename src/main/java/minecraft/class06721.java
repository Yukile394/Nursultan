package minecraft;

public record class06721(class06889 pos, int color, float size) implements class06730 {
   public float L() {
      return this.size;
   }

   public class06721(class06889 pos, int color, float size) {
      super();
      this.pos = pos;
      this.color = color;
      this.size = size;
   }

   public int y() {
      return this.color;
   }

   public class06889 N() {
      return this.pos;
   }

   @Override
   public void N(class06722 var1, float var2) {
      var1.N(this.pos, class02566.N(this.color, var2), this.size);
   }
}
