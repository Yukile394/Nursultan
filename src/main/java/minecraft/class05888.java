package minecraft;

import com.mojang.brigadier.Message;
import com.mojang.brigadier.suggestion.Suggestion;
import java.util.List;

public class class05888 {
   private final class02963 L;
   private final String u;
   private final List<Suggestion> i;
   private int R;
   private int M;
   private class07109 B;
   boolean N;
   private int Z;

   class05888(int var1, int var2, int var3, List<Suggestion> var4, boolean var5, boolean var6) {
      super();
      this.y = var1;
      this.B = class07109.N;
      int ix = var2 - (var1.y.method_1851() ? 0 : 1);
      int j = var1.R ? var3 - 3 - Math.min(var5.size(), var1.i) * 12 : var3 - (var1.y.method_1851() ? 1 : 0);
      this.L = new class02963(ix, j, var4 + 1, Math.min(var5.size(), var1.i) * 12);
      this.u = var1.y.method_1882();
      this.Z = var6 ? -1 : 0;
      this.i = var5;
      this.y(0);
   }

   public void y(int var1) {
      this.M = var1;
      if (this.M < 0) {
         this.M = this.M + this.i.size();
      }

      if (this.M >= this.i.size()) {
         this.M = this.M - this.i.size();
      }

      Suggestion suggestion = this.i.get(this.M);
      this.y.y.method_1887(class05910.N(this.y.y.method_1882(), suggestion.apply(this.u)));
      if (this.Z != this.M) {
         this.y.N.NT().u(this.y());
      }
   }

   class00392 y() {
      this.Z = this.M;
      Suggestion suggestion = this.i.get(this.M);
      Message message = suggestion.getTooltip();
      return message != null
         ? class00392.N("narration.suggestion.tooltip", this.M + 1, this.i.size(), suggestion.getText(), class00392.N(message))
         : class00392.N("narration.suggestion", this.M + 1, this.i.size(), suggestion.getText());
   }

   public boolean N(class06601 var1) {
      if (var1.B()) {
         this.N(-1);
         this.N = false;
         return true;
      } else if (var1.Z()) {
         this.N(1);
         this.N = false;
         return true;
      } else if (var1.z()) {
         if (this.N) {
            this.N(var1.W() ? -1 : 1);
         }

         this.N();
         return true;
      } else if (var1.i()) {
         this.y.L();
         this.y.y.method_1887(null);
         return true;
      } else {
         return false;
      }
   }

   public void N() {
      Suggestion suggestion = this.i.get(this.M);
      this.y.B = true;
      this.y.y.method_1852(suggestion.apply(this.u));
      int ix = suggestion.getRange().getStart() + suggestion.getText().length();
      this.y.y.method_1875(ix);
      this.y.y.method_1884(ix);
      this.y(this.M);
      this.y.B = false;
      this.N = true;
   }

   public void N(class01054 var1, int var2, int var3) {
      int ix = Math.min(this.i.size(), this.y.i);
      int j = -5592406;
      boolean flag = this.R > 0;
      boolean flag1 = this.i.size() > this.R + ix;
      boolean flag2 = flag || flag1;
      boolean flag3 = this.B.z != var2 || this.B.U != var3;
      if (flag3) {
         this.B = new class07109(var2, var3);
      }

      if (flag2) {
         var1.N(this.L.N(), this.L.y() - 1, this.L.N() + this.L.L(), this.L.y(), this.y.M);
         var1.N(this.L.N(), this.L.y() + this.L.u(), this.L.N() + this.L.L(), this.L.y() + this.L.u() + 1, this.y.M);
         if (flag) {
            for (int k = 0; k < this.L.L(); k++) {
               if (k % 2 == 0) {
                  var1.N(this.L.N() + k, this.L.y() - 1, this.L.N() + k + 1, this.L.y(), -1);
               }
            }
         }

         if (flag1) {
            for (int i1 = 0; i1 < this.L.L(); i1++) {
               if (i1 % 2 == 0) {
                  var1.N(this.L.N() + i1, this.L.y() + this.L.u(), this.L.N() + i1 + 1, this.L.y() + this.L.u() + 1, -1);
               }
            }
         }
      }

      boolean flag4 = false;

      for (int l = 0; l < ix; l++) {
         Suggestion suggestion = this.i.get(l + this.R);
         var1.N(this.L.N(), this.L.y() + 12 * l, this.L.N() + this.L.L(), this.L.y() + 12 * l + 12, this.y.M);
         if (var2 > this.L.N() && var2 < this.L.N() + this.L.L() && var3 > this.L.y() + 12 * l && var3 < this.L.y() + 12 * l + 12) {
            if (flag3) {
               this.y(l + this.R);
            }

            flag4 = true;
         }

         var1.y(this.y.L, suggestion.getText(), this.L.N() + 1, this.L.y() + 2 + 12 * l, l + this.R == this.M ? -256 : -5592406);
      }

      if (flag4) {
         Message message = this.i.get(this.M).getTooltip();
         if (message != null) {
            var1.N(this.y.L, class00390.N(message), var2, var3);
         }
      }

      if (this.L.y(var2, var3)) {
         var1.N(class06608.u);
      }
   }

   public void N(int var1) {
      this.y(this.M + var1);
      int ix = this.R;
      int j = this.R + this.y.i - 1;
      if (this.M < ix) {
         this.R = class04995.N(this.M, 0, Math.max(this.i.size() - this.y.i, 0));
      } else if (this.M > j) {
         this.R = class04995.N(this.M + this.y.u - this.y.i, 0, Math.max(this.i.size() - this.y.i, 0));
      }
   }

   public boolean N(int var1, int var2) {
      if (!this.L.y(var1, var2)) {
         return false;
      } else {
         int ix = (var2 - this.L.y()) / 12 + this.R;
         if (ix >= 0 && ix < this.i.size()) {
            this.y(ix);
            this.N();
         }

         return true;
      }
   }

   public boolean N(double var1) {
      int ix = (int)((class06220)this.y.N.L_2).y(this.y.N.Nt());
      int j = (int)((class06220)this.y.N.L_2).L(this.y.N.Nt());
      if (this.L.y(ix, j)) {
         this.R = class04995.N((int)(this.R - var1), 0, Math.max(this.i.size() - this.y.i, 0));
         return true;
      } else {
         return false;
      }
   }
}
