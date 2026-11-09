package minecraft;

import com.google.common.base.MoreObjects;
import java.util.Locale;
import java.util.Optional;
import org.apache.commons.lang3.exception.ExceptionUtils;

class class04797 implements class05532 {
   private int N = 0;
   private int y = 0;

   public class04797() {
      super();
   }

   @Override
   public void y(class05513 var1, class05520 var2) {
      if (!var1.d()) {
         N(var1, var1.m());
         if (var1.Y().L()) {
            this.N(var1, var2, false);
         }
      } else {
         class00201 class00201 = var1.t();
         String s = "Flaky test " + var1 + " failed, attempt: " + this.N + "/" + class00201.z();
         if (class00201.U() > 1) {
            s = s + ", successes: " + this.y + " (" + class00201.U() + " required)";
         }

         N(var1.M(), class06541.field_1054, s);
         if (var1.w() - this.N + this.y >= var1.k()) {
            var2.N(var1);
         } else {
            N(var1, new class04827(this.N, this.y, var1));
         }
      }
   }

   private static Optional<class08610> y(class05513 var0) {
      class04782 class04782 = var0.M();
      return Optional.ofNullable(var0.L()).flatMap(var1x -> class04782.N(var1x, class00404.field_55993));
   }

   private static void y(class05513 var0, String var1) {
      N(var0.M(), class06541.field_1060, var1);
      class04833.y(var0);
   }

   protected static void y(class05513 var0, Throwable var1) {
      String s = var1.getMessage() + (var1.getCause() == null ? "" : " cause: " + class07536.L(var1.getCause()));
      String s1 = (var0.b() ? "" : "(optional) ") + var0.y() + " failed! " + s;
      N(var0.M(), var0.b() ? class06541.field_1061 : class06541.field_1054, s1);
      Throwable throwable = (Throwable)MoreObjects.firstNonNull(ExceptionUtils.getRootCause(var1), var1);
      if (throwable instanceof class05519 class05519) {
         var0.R().N(class05519.u(), class05519.y());
      }

      class04833.N(var0);
   }

   protected static void N(class04782 var0, class06541 var1, String var2) {
      var0.method_18766(var0x -> true).forEach(var2x -> var2x.method_64398(class00392.y(var2).N(var1)));
   }

   @Override
   public void N(class05513 var1) {
      this.N++;
   }

   private void N(class05513 var1, class05520 var2, boolean var3) {
      class04272 class04272 = var1.Y();
      String s = String.format(Locale.ROOT, "[Run: %4d, Ok: %4d, Fail: %4d", this.N, this.y, this.N - this.y);
      if (!class04272.y()) {
         s = s + String.format(Locale.ROOT, ", Left: %4d", class04272.u() - this.N);
      }

      s = s + "]";
      String s1 = var1.y() + " " + (var3 ? "passed" : "failed") + "! " + var1.E() + "ms";
      String s2 = String.format(Locale.ROOT, "%-53s%s", s, s1);
      if (var3) {
         N(var1, s2);
      } else {
         N(var1.M(), class06541.field_1061, s2);
      }

      if (class04272.N(this.N, this.y)) {
         var2.N(var1);
      }
   }

   @Override
   public void N(class05513 var1, class05520 var2) {
      this.y++;
      if (var1.Y().L()) {
         this.N(var1, var2, true);
      } else if (!var1.d()) {
         N(var1, var1.y() + " passed! (" + var1.E() + "ms / " + var1.s() + "gameticks)");
      } else {
         if (this.y >= var1.k()) {
            N(var1, var1 + " passed " + this.y + " times of " + this.N + " attempts.");
         } else {
            N(var1.M(), class06541.field_1060, "Flaky test " + var1 + " succeeded, attempt: " + this.N + " successes: " + this.y);
            var2.N(var1);
         }
      }
   }

   @Override
   public void N(class05513 var1, class05513 var2, class05520 var3) {
      var2.N(this);
   }

   public static void N(class05513 var0, String var1) {
      y(var0).ifPresent(var0x -> var0x.W());
      y(var0, var1);
   }

   protected static void N(class05513 var0, Throwable var1) {
      Object object;
      if (var1 instanceof class05511) {
         object = ((class05511)var1).N();
      } else {
         object = class00392.y(class07536.L(var1));
      }

      y(var0).ifPresent(var1x -> var1x.N(object));
      y(var0, var1);
   }
}
