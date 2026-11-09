package minecraft;

import java.nio.file.Path;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class06434 implements Comparable<class06434> {
   public static final class00392 N = class00392.L("selectWorld.select");
   private final class07312 y;
   private final class05976 L;
   private final String u;
   private final boolean i;
   private final boolean R;
   private final boolean M;
   private final Path B;
   @Nullable
   private class00392 Z;

   private class00392 w() {
      if (this.s()) {
         return class00392.L("selectWorld.locked").N(class06541.field_1061);
      } else if (this.u()) {
         return class00392.L("selectWorld.conversion").N(class06541.field_1061);
      } else if (!this.b()) {
         return class00392.N("selectWorld.incompatible.info", this.U()).N(class06541.field_1061);
      } else {
         class05216 class05216xx = this.Z() ? class00392.i().y(class00392.L("gameMode.hardcore").y(-65536)) : class00392.L("gameMode." + this.B().y());
         if (this.z()) {
            class05216xx.i(", ").y(class00392.L("selectWorld.commands"));
         }

         if (this.i()) {
            class05216xx.i(", ").y(class00392.L("selectWorld.experimental").N(class06541.field_1054));
         }

         class05216 class05216x = this.U();
         class05216 class05216xx = class00392.y(", ").y(class00392.L("selectWorld.version")).y(class05220.l);
         if (this.W()) {
            class05216xx.y(class05216x.N(this.m() ? class06541.field_1061 : class06541.field_1056));
         } else {
            class05216xx.y(class05216x);
         }

         class05216xx.y(class05216xx);
         return class05216xx;
      }
   }

   public Path L() {
      return this.B;
   }

   public class07312 M() {
      return this.y;
   }

   public class06449 P() {
      class04551 class04551 = class07529.y();
      int ix = class04551.comp_4026().y();
      int j = this.L.u().y();
      if (!class04551.comp_4031() && j < ix) {
         return class06449.field_28439;
      } else {
         return j > ix ? class06449.field_28438 : class06449.field_28437;
      }
   }

   public boolean T() {
      return !this.s() && !this.u() ? !this.b() : true;
   }

   public class06434(class07312 var1, class05976 var2, String var3, boolean var4, boolean var5, boolean var6, Path var7) {
      super();
      this.y = var1;
      this.L = var2;
      this.u = var3;
      this.R = var5;
      this.M = var6;
      this.B = var7;
      this.i = var4;
   }

   public class07282 B() {
      return this.y.y();
   }

   public boolean Z() {
      return this.y.L();
   }

   public boolean i() {
      return this.M;
   }

   public boolean b() {
      return class07529.y().comp_4026().N(this.L.u());
   }

   public boolean s() {
      return this.R;
   }

   public boolean n() {
      return !this.T();
   }

   public boolean l() {
      return !this.T();
   }

   public boolean d() {
      return true;
   }

   public boolean m() {
      return this.P() == class06449.field_28438;
   }

   public boolean t() {
      return !this.u() && !this.s();
   }

   public class00392 v() {
      return N;
   }

   public class00392 j() {
      if (this.Z == null) {
         this.Z = this.w();
      }

      return this.Z;
   }

   public class05216 U() {
      return class05018.y(this.L.L()) ? class00392.L("selectWorld.versionUnknown") : class00392.y(this.L.L());
   }

   public boolean z() {
      return this.y.i();
   }

   public boolean u() {
      return this.i;
   }

   public String y() {
      return StringUtils.isEmpty(this.y.N()) ? this.u : this.y.N();
   }

   public class05976 E() {
      return this.L;
   }

   public int compareTo(class06434 var1) {
      if (this.R() < var1.R()) {
         return 1;
      } else {
         return this.R() > var1.R() ? -1 : this.u.compareTo(var1.u);
      }
   }

   public String N() {
      return this.u;
   }

   public boolean W() {
      return this.P().N();
   }

   public long R() {
      return this.L.y();
   }

   public boolean G() {
      return !this.T();
   }
}
