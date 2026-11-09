package minecraft;

import Nursultan.class11647;

record class08691(class03254 trim, class08719 layerType, class05946<class11647> equipmentAssetId) {
   public class08719 L() {
      return this.layerType;
   }

   class08691(class03254 trim, class08719 layerType, class05946<class11647> equipmentAssetId) {
      super();
      this.trim = trim;
      this.layerType = layerType;
      this.equipmentAssetId = equipmentAssetId;
   }

   public class05946<class11647> u() {
      return this.equipmentAssetId;
   }

   public class03254 y() {
      return this.trim;
   }

   public class01894 N() {
      return this.trim.N(this.layerType.N(), this.equipmentAssetId);
   }
}
