package minecraft;

import java.util.ListIterator;

record class06701(class05946<class07299> dimensionKey, class06172 storage, ListIterator<class06699> files) {

   public ListIterator<class06699> L() {
      return this.files;
   }

   class06701(class05946<class07299> dimensionKey, class06172 storage, ListIterator<class06699> files) {
      this.dimensionKey = dimensionKey;
      this.storage = storage;
      this.files = files;
   }

   public class06172 y() {
      return this.storage;
   }

   public class05946<class07299> N() {
      return this.dimensionKey;
   }
}
