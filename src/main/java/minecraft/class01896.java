package minecraft;

import Nursultan.class09545;
import java.util.Iterator;

public record class01896(
   class05934 options,
   class00751<class01255> datapackDimensions,
   class03764 selectedDimensions,
   class02003<class02969> worldgenRegistries,
   class01248 dataPackResources,
   class03776 dataConfiguration,
   class08707 initialWorldCreationOptions
) {
   public class05934 L() {
      return this.options;
   }

   public class01248 M() {
      return this.dataPackResources;
   }

   public class01896(class03796 var1, class02003<class02969> var2, class01248 var3, class03776 var4) {
      this(var1.N(), var1.y(), var2, var3, var4, new class08707(class03678.field_20624, class06826.N(), null));
   }

   public class01896(
      class05934 options,
      class00751<class01255> datapackDimensions,
      class03764 selectedDimensions,
      class02003<class02969> worldgenRegistries,
      class01248 dataPackResources,
      class03776 dataConfiguration,
      class08707 initialWorldCreationOptions
   ) {
      super();
      this.options = options;
      this.datapackDimensions = datapackDimensions;
      this.selectedDimensions = selectedDimensions;
      this.worldgenRegistries = worldgenRegistries;
      this.dataPackResources = dataPackResources;
      this.dataConfiguration = dataConfiguration;
      this.initialWorldCreationOptions = initialWorldCreationOptions;
   }

   public class01896(class05934 var1, class03764 var2, class02003<class02969> var3, class01248 var4, class03776 var5, class08707 var6) {
      this(var1, var3.N(class02969.field_39973).L(class04227.yI), var2, var3.N(class02969.field_39973), var4, var5, var6);
   }

   public class03776 B() {
      return this.dataConfiguration;
   }

   public class08707 Z() {
      return this.initialWorldCreationOptions;
   }

   public class03764 i() {
      return this.selectedDimensions;
   }

   public class00751<class01255> u() {
      return this.datapackDimensions;
   }

   public void y() {
      Iterator<class01255> iterator = this.u().iterator();

      while (iterator.hasNext()) {
         iterator.next().y().N();
      }
   }

   public class01896 N(class05934 var1, class03764 var2) {
      return new class01896(
         var1, this.datapackDimensions, var2, this.worldgenRegistries, this.dataPackResources, this.dataConfiguration, this.initialWorldCreationOptions
      );
   }

   public class01022 N() {
      return this.worldgenRegistries.N();
   }

   public class01896 N(class09545 var1) {
      return new class01896(
         var1.apply(this.options),
         this.datapackDimensions,
         this.selectedDimensions,
         this.worldgenRegistries,
         this.dataPackResources,
         this.dataConfiguration,
         this.initialWorldCreationOptions
      );
   }

   public class01896 N(class01935 var1) {
      return new class01896(
         this.options,
         this.datapackDimensions,
         var1.apply(this.N(), this.selectedDimensions),
         this.worldgenRegistries,
         this.dataPackResources,
         this.dataConfiguration,
         this.initialWorldCreationOptions
      );
   }

   public class02003<class02969> R() {
      return this.worldgenRegistries;
   }
}
