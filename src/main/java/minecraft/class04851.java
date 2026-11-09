package minecraft;

public interface class04851 extends class04878 {
   class04890 load(class01224 var1, class07001 var2);

   @Override
   default class04890 load(class03298 var1, class07001 var2) {
      return this.load(var1.L(), var2);
   }
}
