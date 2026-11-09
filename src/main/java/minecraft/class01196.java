package minecraft;

import java.util.List;
import java.util.Map;

public record class01196<T>(class05946<? extends class00751<T>> key, Map<class03530<T>, List<class03556<T>>> tags) {

   public class01196(class05946<? extends class00751<T>> key, Map<class03530<T>, List<class03556<T>>> tags) {
      this.key = key;
      this.tags = tags;
   }

   public Map<class03530<T>, List<class03556<T>>> y() {
      return this.tags;
   }

   public class05946<? extends class00751<T>> N() {
      return this.key;
   }
}
