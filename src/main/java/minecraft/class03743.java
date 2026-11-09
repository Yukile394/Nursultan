package minecraft;

import java.util.UUID;
import org.jspecify.annotations.Nullable;

public class class03743 extends class03709<class03740> {
   private static final class00392 m = class00392.L("gui.abuseReport.name.title");
   private static final class00392 P = class00392.L("gui.abuseReport.name.comment_box_label");
   @Nullable
   private class03943 s;

   public class03743(class05096 var1, class03409 var2, class03732 var3) {
      this(var1, var2, new class03740(var3, var2.N().y()));
   }

   public class03743(class05096 var1, class03409 var2, UUID var3, String var4) {
      this(var1, var2, new class03740(var3, var4, var2.N().y()));
   }

   private class03743(class05096 var1, class03409 var2, class03740 var3) {
      super(m, var1, var2, var3);
   }

   @Override
   protected void N() {
      class05216 class05216 = class00392.y(this.E.i().N()).N(class06541.field_1054);
      this.U.N(new class02071(class00392.N("gui.abuseReport.name.reporting", class05216), this.field_22793), var0 -> var0.y().N(0, 8));
      this.s = this.N(280, 72, var1x -> {
         this.E.N(var1x);
         this.y();
      });
      this.U.N(class03725.N(this.field_22793, this.s, P, var0 -> var0.i(12)));
   }

   @Override
   public boolean method_25406(class06613 var1) {
      if (super.method_25406(var1)) {
         return true;
      } else {
         return this.s != null ? this.s.method_25406(var1) : false;
      }
   }
}
