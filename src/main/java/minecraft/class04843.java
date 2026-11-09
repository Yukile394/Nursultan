package minecraft;

import java.util.List;
import java.util.Map;

record class04843(Map<class01894, List<class06251>> fontSets, List<class06262> allProviders) {

   class04843(Map<class01894, List<class06251>> fontSets, List<class06262> allProviders) {
      super();
      this.fontSets = fontSets;
      this.allProviders = allProviders;
   }

   public List<class06262> y() {
      return this.allProviders;
   }

   public Map<class01894, List<class06251>> N() {
      return this.fontSets;
   }
}
