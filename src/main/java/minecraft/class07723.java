package minecraft;

import java.util.stream.Stream;

interface class07723 {
   class07709 N();

   default class07723 N(Stream<class07709> var1) {
      return this.N(var1::iterator);
   }

   default class07723 N(Iterable<class07709> var1) {
      class07723 class07723 = this;

      for (class07709 class07709 : var1) {
         class07723 = class07723.N(class07709);
      }

      return class07723;
   }

   class07723 N(class07709 var1);
}
