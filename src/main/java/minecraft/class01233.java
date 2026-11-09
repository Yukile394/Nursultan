package minecraft;

import Nursultan.class09444;
import com.google.common.collect.Lists;
import java.util.List;
import org.jspecify.annotations.Nullable;

public class class01233 {
   private class07111 N = class07111.field_11302;
   private class06993 y = class06993.field_11467;
   private class07209 L = class07209.field_10980;
   private boolean u;
   @Nullable
   private class05163 i;
   private class02610 R = class02610.field_52238;
   @Nullable
   private class06069 M;
   private int B;
   private final List<class01219> Z = Lists.newArrayList();
   private boolean z;
   private boolean U;

   public class07111 L() {
      return this.N;
   }

   public class01233 L(boolean var1) {
      this.U = var1;
      return this;
   }

   @Nullable
   public class05163 M() {
      return this.i;
   }

   public class01233() {
      super();
   }

   public boolean B() {
      return this.z;
   }

   public List<class01219> Z() {
      return this.Z;
   }

   public class07209 i() {
      return this.L;
   }

   public boolean U() {
      return this.U;
   }

   public boolean z() {
      return this.R == class02610.field_52238;
   }

   public class06993 u() {
      return this.y;
   }

   public class01233 y(class01219 var1) {
      this.Z.remove(var1);
      return this;
   }

   public class01233 y() {
      this.Z.clear();
      return this;
   }

   public class01233 y(boolean var1) {
      this.z = var1;
      return this;
   }

   public class06069 y(@Nullable class07209 var1) {
      if (this.M != null) {
         return this.M;
      } else {
         return var1 == null ? class06069.y(class07536.L()) : class06069.y(class04995.N(var1));
      }
   }

   public class01233 N(class06993 var1) {
      this.y = var1;
      return this;
   }

   public class01233 N(class07111 var1) {
      this.N = var1;
      return this;
   }

   public class01233 N(class02610 var1) {
      this.R = var1;
      return this;
   }

   public class09444 N(List<class09444> var1, @Nullable class07209 var2) {
      int ix = var1.size();
      if (ix == 0) {
         throw new IllegalStateException("No palettes");
      } else {
         return (class09444)var1.get(this.y(var2).y(ix));
      }
   }

   public class01233 N() {
      class01233 class01233 = new class01233();
      class01233.N = this.N;
      class01233.y = this.y;
      class01233.L = this.L;
      class01233.u = this.u;
      class01233.i = this.i;
      class01233.R = this.R;
      class01233.M = this.M;
      class01233.B = this.B;
      class01233.Z.addAll(this.Z);
      class01233.z = this.z;
      class01233.U = this.U;
      return class01233;
   }

   public class01233 N(class01219 var1) {
      this.Z.add(var1);
      return this;
   }

   public class01233 N(@Nullable class06069 var1) {
      this.M = var1;
      return this;
   }

   public class01233 N(class05163 var1) {
      this.i = var1;
      return this;
   }

   public class01233 N(boolean var1) {
      this.u = var1;
      return this;
   }

   public class01233 N(class07209 var1) {
      this.L = var1;
      return this;
   }

   public boolean R() {
      return this.u;
   }
}
