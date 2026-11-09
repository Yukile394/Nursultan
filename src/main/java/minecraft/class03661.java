package minecraft;

import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalLong;
import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class03661 {
   private static final class00392 N = class00392.L("selectWorld.newWorld");
   private final List<Consumer<class03661>> y = new ArrayList<>();
   private String L = N.getString();
   private class03678 u = class03678.field_20624;
   private class07086 i = class07086.field_5802;
   @Nullable
   private Boolean R;
   private String M;
   private boolean B;
   private boolean Z;
   private final Path z;
   private String U;
   private class01896 E;
   private class03690 W;
   private final List<class03690> m = new ArrayList<>();
   private final List<class03690> P = new ArrayList<>();
   private class07305 s;

   public void L(boolean var1) {
      this.Z = var1;
      this.N();
   }

   public String L() {
      return this.U;
   }

   private String L(String var1) {
      String sx = var1.trim();

      try {
         return class06290.N(this.z, !sx.isEmpty() ? sx : N.getString(), "");
      } catch (Exception exception) {
         try {
            return class06290.N(this.z, "World", "");
         } catch (IOException ioexception) {
            throw new RuntimeException("Could not create save folder", ioexception);
         }
      }
   }

   public boolean M() {
      if (this.E()) {
         return true;
      } else if (this.R()) {
         return false;
      } else {
         return this.R == null ? this.u() == class03678.field_20626 : this.R;
      }
   }

   public List<class03690> P() {
      return this.m;
   }

   public class07305 T() {
      return this.s;
   }

   public class03661(Path var1, class01896 var2, Optional<class05946<class04382>> var3, OptionalLong var4) {
      super();
      this.z = var1;
      this.E = var2;
      this.W = new class03690(N(var2, var3).orElse(null));
      this.b();
      this.M = var4.isPresent() ? Long.toString(var4.getAsLong()) : "";
      this.B = var2.L().u();
      this.Z = var2.L().i();
      this.U = this.L(this.L);
      this.u = var2.Z().N();
      this.s = new class07305(var2.B().y());
      this.s.N(var2.Z().y(), null);
      Optional.ofNullable(var2.Z().L())
         .flatMap(var1x -> var2.N().method_46759(class04227.yM).flatMap(var1xx -> var1xx.N(var1x)))
         .map(var0 -> var0.N().y())
         .ifPresent(var1x -> this.N(class05966.N(var1x)));
   }

   public String B() {
      return this.M;
   }

   public boolean Z() {
      return this.E() ? false : this.B;
   }

   public class07086 i() {
      return this.R() ? class07086.field_5807 : this.i;
   }

   private void b() {
      class00751 class00751 = this.U().N().L(class04227.yO);
      this.m.clear();
      this.m.addAll(N(class00751, class04420.N).orElseGet(() -> class00751.z().map(class03690::new).toList()));
      this.P.clear();
      this.P.addAll(N(class00751, class04420.y).orElse(this.m));
      class03556<class04382> class03556 = this.W.L();
      if (class03556 != null) {
         class03690 class03690 = N(this.U(), class03556.i()).map(class03690::new).orElse(this.m.getFirst());
         if (class05966.N.get(class03556.i()) != null) {
            this.W = class03690;
         } else {
            this.N(class03690);
         }
      }
   }

   public List<class03690> s() {
      return this.P;
   }

   @Nullable
   public class05966 m() {
      class03556<class04382> class03556 = this.W().L();
      return class03556 != null ? class05966.N.get(class03556.i()) : null;
   }

   public class01896 U() {
      return this.E;
   }

   public boolean z() {
      return !this.E() && !this.R() ? this.Z : false;
   }

   public class03678 u() {
      return this.E() ? class03678.field_20627 : this.u;
   }

   public void y(String var1) {
      this.M = var1;
      this.E = this.E.N(var1x -> var1x.N(class05934.N(this.B())));
      this.N();
   }

   public String y() {
      return this.L;
   }

   public void y(boolean var1) {
      this.B = var1;
      this.N();
   }

   public boolean E() {
      return this.E.i().L();
   }

   public void N() {
      boolean flag = this.z();
      if (flag != this.E.L().i()) {
         this.E = this.E.N(var1x -> var1x.N(flag));
      }

      boolean flag1 = this.Z();
      if (flag1 != this.E.L().u()) {
         this.E = this.E.N(var1x -> var1x.y(flag1));
      }

      Iterator<Consumer<class03661>> iterator = this.y.iterator();

      while (iterator.hasNext()) {
         iterator.next().accept(this);
      }
   }

   public void N(class07086 var1) {
      this.i = var1;
      this.N();
   }

   public void N(class03678 var1) {
      this.u = var1;
      this.N();
   }

   public void N(class01896 var1) {
      this.E = var1;
      this.b();
      this.N();
   }

   public void N(class01935 var1) {
      this.E = this.E.N(var1);
      this.N();
   }

   public void N(class03690 var1) {
      this.W = var1;
      class03556<class04382> class03556 = var1.L();
      if (class03556 != null) {
         this.N((var1x, var2x) -> class03556.N().N());
      }
   }

   public void N(String var1) {
      this.L = var1;
      this.U = this.L(var1);
      this.N();
   }

   protected boolean N(class03776 var1) {
      class03776 class03776 = this.E.B();
      if (class03776.N().N().equals(var1.N().N()) && class03776.y().equals(var1.y())) {
         this.E = new class01896(this.E.L(), this.E.u(), this.E.i(), this.E.R(), this.E.M(), var1, this.E.Z());
         return true;
      } else {
         return false;
      }
   }

   public void N(class07305 var1) {
      this.s = var1;
      this.N();
   }

   private static Optional<List<class03690>> N(class00751<class04382> var0, class03530<class04382> var1) {
      return var0.N(var1).map(var0x -> var0x.N().map(class03690::new).toList()).filter(var0x -> !var0x.isEmpty());
   }

   public void N(Consumer<class03661> var1) {
      this.y.add(var1);
   }

   public void N(boolean var1) {
      this.R = var1;
      this.N();
   }

   private static Optional<class03556<class04382>> N(class01896 var0, Optional<class05946<class04382>> var1) {
      return var1.flatMap(var1x -> var0.N().L(class04227.yO).N((class05946<class04382>)var1x));
   }

   public class03690 W() {
      return this.W;
   }

   public boolean R() {
      return this.u() == class03678.field_20625;
   }
}
