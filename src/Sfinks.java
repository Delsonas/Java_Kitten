public class Sfinks implements Kitten
{
    @Override
    public double weight()
    {
        return(((Math.random()) * (2.5 - 1.5))+1.5);
    }
    @Override
    public String sound()
    {
        return("Мяяууу *котёнок тихонько мяукнул*");
    }

    @Override
    public String comeToMe()
    {
        return("Топ-топ-топ-топ-топ....Мяяу! *котёнок быстренько подошёл к вам и радостно смотрит на вас*");
    }

}
