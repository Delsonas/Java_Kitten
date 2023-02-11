/**
 * Кошка
 *
 * @author Violetta
 */
public class MaineCoon implements Kitten
{
    @Override
    public double weight()
    {
        return(((Math.random()) * (3.5 - 2))+2);
    }

    @Override
    public String sound()
    {
        return("Мяяяяяяууууууууу *котёнок громко и протяжно мяукнул*");
    }

    @Override
    public String comeToMe()
    {
        return("Топ-топ-топ....Мяяу? *котёнок вальяжно подошёл к вам и вопросительно смотрит на вас*");
    }

}

