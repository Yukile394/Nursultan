package minecraft;

import org.jspecify.annotations.Nullable;

public class class06501 {
   @Nullable
   private final class08036 field_8942;
   private final class07050 field_19176;
   private final class06183 field_17543;
   private final class07299 field_8945;
   private final class06584 field_8941;

   public class06501(class08036 var1, class07050 var2, class06183 var3) {
      this(var1.method_73183(), var1, var2, var1.method_5998(var2), var3);
   }

   public class06501(class07299 var1, @Nullable class08036 var2, class07050 var3, class06584 var4, class06183 var5) {
      super();
      this.field_8942 = var2;
      this.field_19176 = var3;
      this.field_17543 = var5;
      this.field_8941 = var4;
      this.field_8945 = var1;
   }

   @Nullable
   public class08036 method_8036() {
      return this.field_8942;
   }

   public class07209 method_8037() {
      return this.field_17543.u();
   }

   public class07299 method_8045() {
      return this.field_8945;
   }

   public class06584 method_8041() {
      return this.field_8941;
   }

   public class07050 method_20287() {
      return this.field_19176;
   }

   protected final class06183 method_30344() {
      return this.field_17543;
   }

   public float method_8044() {
      return this.field_8942 == null ? 0.0F : this.field_8942.method_36454();
   }

   public class07211 method_8038() {
      return this.field_17543.i();
   }

   public class06889 method_17698() {
      return this.field_17543.y();
   }

   public boolean method_17699() {
      return this.field_17543.R();
   }

   public class07211 method_8042() {
      return this.field_8942 == null ? class07211.field_11043 : this.field_8942.method_5735();
   }

   public boolean method_8046() {
      return this.field_8942 != null && this.field_8942.method_21823();
   }
}
