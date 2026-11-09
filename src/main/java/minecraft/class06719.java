package minecraft;

public record class06719(class06889 pos, String text, class06715 style) implements class06730 {
   public class06715 L() {
      return this.style;
   }

   public class06719(class06889 pos, String text, class06715 style) {
      super();
      this.pos = pos;
      this.text = text;
      this.style = style;
   }

   public String y() {
      return this.text;
   }

   public class06889 N() {
      return this.pos;
   }

   @Override
   public void N(class06722 var1, float var2) {
      class06715 class06715;
      if (var2 < 1.0F) {
         class06715 = new class06715(class02566.N(this.style.y(), var2), this.style.L(), this.style.u());
      } else {
         class06715 = this.style;
      }

      var1.N(this.pos, this.text, class06715);
   }
}
