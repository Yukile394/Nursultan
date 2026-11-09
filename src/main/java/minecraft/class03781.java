package minecraft;

import com.mojang.serialization.Lifecycle;
import java.util.List;

public record class03781(class00751<class01255> dimensions, class06228 specialWorldProperty) {
   public class00751<class01255> L() {
      return this.dimensions;
   }

   public class03781(class00751<class01255> dimensions, class06228 specialWorldProperty) {
      super();
      this.dimensions = dimensions;
      this.specialWorldProperty = specialWorldProperty;
   }

   public class06228 u() {
      return this.specialWorldProperty;
   }

   public class01022 y() {
      return new class01014(List.of(this.dimensions)).method_40316();
   }

   public Lifecycle N() {
      return this.dimensions.R();
   }
}
