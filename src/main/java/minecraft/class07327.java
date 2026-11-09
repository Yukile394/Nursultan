package minecraft;

import java.util.Objects;
import org.jspecify.annotations.Nullable;

public abstract class class07327 {
   private static final class00392 N = class00392.y("@");
   private static final int L = -1;
   private long u = -1L;
   private boolean i = true;
   private int R;
   private boolean M = true;
   @Nullable
   public class00392 y;
   private String B = "";
   @Nullable
   private class00392 Z;

   private class07315 L(class04782 var1) {
      return this.M ? new class07315(this, var1) : null;
   }

   public class00392 L() {
      return this.y == null ? class05220.N : this.y;
   }

   public boolean M() {
      return this.M;
   }

   public class07327() {
      super();
   }

   public class00392 i() {
      return this.Z != null ? this.Z : N;
   }

   public String u() {
      return this.B;
   }

   public int y() {
      return this.R;
   }

   public void y(@Nullable class00392 var1) {
      this.y = var1;
   }

   public boolean y(class04782 var1) {
      if (var1.N() == this.u) {
         return false;
      } else if ("Searge".equalsIgnoreCase(this.B)) {
         this.y = class00392.y("#itzlipofutzli");
         this.R = 1;
         return true;
      } else {
         this.R = 0;
         if (var1.method_75000() && !class05018.y(this.B)) {
            try {
               this.y = null;

               try (class07315 class07315 = this.L(var1)) {
                  class07703 class07703 = Objects.requireNonNullElse(class07315, class07703.j_);
                  class07701 class07701 = this.N(var1, class07703).y((var1x, var2x) -> {
                     if (var1x) {
                        this.R++;
                     }
                  });
                  var1.method_8503().yL().N(class07701, this.B);
               }
            } catch (Throwable throwable1) {
               class07080 class07080 = class07080.N(throwable1, "Executing command block");
               class07074 class07074 = class07080.N("Command to be executed");
               class07074.N("Command", this::u);
               class07074.N("Name", () -> this.i().getString());
               throw new class07878(class07080);
            }
         }

         if (this.i) {
            this.u = var1.N();
         } else {
            this.u = -1L;
         }

         return true;
      }
   }

   public void N(boolean var1) {
      this.M = var1;
   }

   public abstract boolean N();

   public abstract class07701 N(class04782 var1, class07703 var2);

   public void N(class08299 var1) {
      this.B = var1.N("Command", "");
      this.R = var1.N("SuccessCount", 0);
      this.N(class00394.N_10(var1, "CustomName"));
      this.M = var1.N("TrackOutput", true);
      if (this.M) {
         this.y = class00394.N_10(var1, "LastOutput");
      } else {
         this.y = null;
      }

      this.i = var1.N("UpdateLastExecution", true);
      if (this.i) {
         this.u = var1.N("LastExecution", -1L);
      } else {
         this.u = -1L;
      }
   }

   public void N(String var1) {
      this.B = var1;
      this.R = 0;
   }

   public void N(class08329 var1) {
      var1.N("Command", this.B);
      var1.N("SuccessCount", this.R);
      var1.y("CustomName", class03748.N, this.Z);
      var1.N("TrackOutput", this.M);
      if (this.M) {
         var1.y("LastOutput", class03748.N, this.y);
      }

      var1.N("UpdateLastExecution", this.i);
      if (this.i && this.u != -1L) {
         var1.N("LastExecution", this.u);
      }
   }

   public abstract void N(class04782 var1);

   public void N(@Nullable class00392 var1) {
      this.Z = var1;
   }

   public void N(int var1) {
      this.R = var1;
   }

   @Nullable
   public class00392 R() {
      return this.Z;
   }
}
