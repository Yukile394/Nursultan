package minecraft;

public record class06737(class00734 aabb, class06747 style, boolean coloredCornerStroke) implements class06730 {
   public boolean L() {
      return this.coloredCornerStroke;
   }

   public class06737(class00734 aabb, class06747 style, boolean coloredCornerStroke) {
      this.aabb = aabb;
      this.style = style;
      this.coloredCornerStroke = coloredCornerStroke;
   }

   public class06747 y() {
      return this.style;
   }

   public class00734 N() {
      return this.aabb;
   }

   @Override
   public void N(class06722 var1, float var2) {
      double d0 = this.aabb.N;
      double d1 = this.aabb.y;
      double d2 = this.aabb.L;
      double d3 = this.aabb.u;
      double d4 = this.aabb.i;
      double d5 = this.aabb.R;
      if (this.style.N()) {
         int i = this.style.y(var2);
         var1.N(new class06889(d3, d1, d2), new class06889(d3, d4, d2), new class06889(d3, d4, d5), new class06889(d3, d1, d5), i);
         var1.N(new class06889(d0, d1, d2), new class06889(d0, d1, d5), new class06889(d0, d4, d5), new class06889(d0, d4, d2), i);
         var1.N(new class06889(d0, d1, d2), new class06889(d0, d4, d2), new class06889(d3, d4, d2), new class06889(d3, d1, d2), i);
         var1.N(new class06889(d0, d1, d5), new class06889(d3, d1, d5), new class06889(d3, d4, d5), new class06889(d0, d4, d5), i);
         var1.N(new class06889(d0, d4, d2), new class06889(d0, d4, d5), new class06889(d3, d4, d5), new class06889(d3, d4, d2), i);
         var1.N(new class06889(d0, d1, d2), new class06889(d3, d1, d2), new class06889(d3, d1, d5), new class06889(d0, d1, d5), i);
      }

      if (this.style.y()) {
         int j = this.style.N(var2);
         var1.N(new class06889(d0, d1, d2), new class06889(d3, d1, d2), this.coloredCornerStroke ? class02566.N(j, -34953) : j, this.style.u());
         var1.N(new class06889(d0, d1, d2), new class06889(d0, d4, d2), this.coloredCornerStroke ? class02566.N(j, -8913033) : j, this.style.u());
         var1.N(new class06889(d0, d1, d2), new class06889(d0, d1, d5), this.coloredCornerStroke ? class02566.N(j, -8947713) : j, this.style.u());
         var1.N(new class06889(d3, d1, d2), new class06889(d3, d4, d2), j, this.style.u());
         var1.N(new class06889(d3, d4, d2), new class06889(d0, d4, d2), j, this.style.u());
         var1.N(new class06889(d0, d4, d2), new class06889(d0, d4, d5), j, this.style.u());
         var1.N(new class06889(d0, d4, d5), new class06889(d0, d1, d5), j, this.style.u());
         var1.N(new class06889(d0, d1, d5), new class06889(d3, d1, d5), j, this.style.u());
         var1.N(new class06889(d3, d1, d5), new class06889(d3, d1, d2), j, this.style.u());
         var1.N(new class06889(d0, d4, d5), new class06889(d3, d4, d5), j, this.style.u());
         var1.N(new class06889(d3, d1, d5), new class06889(d3, d4, d5), j, this.style.u());
         var1.N(new class06889(d3, d4, d2), new class06889(d3, d4, d5), j, this.style.u());
      }
   }
}
