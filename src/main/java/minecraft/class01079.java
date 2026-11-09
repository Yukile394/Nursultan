package minecraft;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import net.fabricmc.fabric.api.resource.v1.FabricResource;
import net.fabricmc.fabric.impl.resource.PackSourceTracker;
import org.jspecify.annotations.Nullable;

public class class01079 implements FabricResource {
   private final class01622 field_40054;
   private final class03652<InputStream> field_38685;
   private final class03652<class03643> field_38686;
   @Nullable
   private class03643 field_38687;

   public class01079(class01622 var1, class03652<InputStream> var2, class03652<class03643> var3) {
      super();
      this.field_40054 = var1;
      this.field_38685 = var2;
      this.field_38686 = var3;
   }

   public class01079(class01622 var1, class03652<InputStream> var2) {
      super();
      this.field_40054 = var1;
      this.field_38685 = var2;
      this.field_38686 = class03643.y;
      this.field_38687 = class03643.N;
   }

   public InputStream method_14482() throws IOException {
      return this.field_38685.get();
   }

   public BufferedReader method_43039() throws IOException {
      return new BufferedReader(new InputStreamReader(this.method_14482(), StandardCharsets.UTF_8));
   }

   public String method_14480() {
      return this.field_40054.method_14409();
   }

   public Optional<class02298> method_56936() {
      return this.field_40054.N();
   }

   public class01622 method_45304() {
      return this.field_40054;
   }

   public class01283 getFabricPackSource() {
      return PackSourceTracker.getSource(this.method_45304());
   }

   public class03643 method_14481() throws IOException {
      if (this.field_38687 == null) {
         this.field_38687 = this.field_38686.get();
      }

      return this.field_38687;
   }
}
