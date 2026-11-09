package minecraft;

import java.util.function.Consumer;
import org.jspecify.annotations.Nullable;

public class class05190 {
   private final class06202 N;
   private final class05096 y;
   private int L;
   private int u;
   private String i = "";
   private class05217 R = class05217.field_62201;
   @Nullable
   private class05231 M = null;
   @Nullable
   private Consumer<class06434> B = null;
   @Nullable
   private Consumer<class05944> Z = null;

   public class05190(class06202 var1, class05096 var2) {
      super();
      this.N = var1;
      this.y = var2;
   }

   public class05190 y(Consumer<class05944> var1) {
      this.Z = var1;
      return this;
   }

   public class05231 y() {
      return new class05231(this.y, this.N, this.L, this.u, this.i, this.M, this.B, this.Z, this.R);
   }

   public class05190 y(int var1) {
      this.u = var1;
      return this;
   }

   public class05190 N(int var1) {
      this.L = var1;
      return this;
   }

   public class05190 N() {
      this.R = class05217.field_62202;
      return this;
   }

   public class05190 N(@Nullable class05231 var1) {
      this.M = var1;
      return this;
   }

   public class05190 N(Consumer<class06434> var1) {
      this.B = var1;
      return this;
   }

   public class05190 N(String var1) {
      this.i = var1;
      return this;
   }
}
