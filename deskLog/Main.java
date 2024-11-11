import java.util.Random;
class Main {
  public static void main(String[] args) {
    int min = 0;
    int max = 50; 
    int count = 501;
      while (count<=600){
   System.out.print("Desk Log Day ");
        System.out.print(count);
        System.out.println(":");
  System.out.print("The desk is ");
        String[] deskAdjectives = {"Motionless", "Quiet", "Serene", "Calm", "Tranquil", "Stationary", "Unmoving", "Undisturbed", "Peaceful", "Stagnant", "Unwavering", "Inert", "Unflinching", "Unruffled", "Static","Silent", "Immobile", "Serenity", "Placid", "Motion-free", "Calmness", "Unperturbed", "Quiescent", "Composed", "Peacefulness", "Unchanging", "Steadfast",  "Stability", "Unmoved", "Unagitated", "Motionless", "Undisturbed", "Unfaltering", "Sturdy", "Sleek", "Functional", "Organized","Modern", "Spacious", "Elegant", "Versatile","Compact", "Ergonomic", "Stylish", "Durable","Practical", "Neat", "Contemporary", "Efficient","Minimalistic", "Adjustable", "Productive", "Well-designed","Classic", "Inviting", "Timeless", "Functional","Sleek", "Minimalistic", "Space-saving", "Ergonomic","Rustic", "Charming", "Natural", "Organized","High-tech", "Futuristic", "Multi-purpose", "Efficient","Contemporary", "Sleek", "Streamlined", "Versatile","Vintage", "Antique", "Ornate", "Elegant","Cozy", "Compact", "Practical", "Well-crafted","Industrial", "Robust", "Utilitarian", "Neat","Luxurious", "Polished", "Opulent", "Functional","Creative", "Inspiring", "Artistic", "Well-arranged","Eerie", "Haunting", "Macabre", "Sinister","Cursed", "Mysterious", "Shadowy", "Spooky","Cryptic", "Ghostly", "Grim", "Uncanny","Foreboding", "Petrifying", "Chilling", "Supernatural","Menacing", "Enigmatic", "Bloodcurdling", "Nightmarish","Foreboding", "Shadowy", "Mysterious", "Uncanny","Menacing", "Sinister", "Haunting", "Eerie","Ominous", "Grim", "Enigmatic", "Brooding","Cryptic", "Troubling", "Portentous", "Spine-chilling","Unsettling", "Creepy", "Disquieting", "Unnerving", "Alluringly ominous", "Intriguingly eerie", "Seductively haunting", "Enchantingly mysterious","Curiously uncanny", "Uniquely menacing", "Captivatingly sinister", "Hypnotically grim","Strangely enigmatic", "Unconventionally foreboding", "Darkly attractive", "Exquisitely brooding","Fascinatingly cryptic", "Peculiarly troubling", "Mysteriously alluring", "Eerily enticing","Compellingly portentous", "Hauntingly enchanting", "Bewitchingly disquieting", "Oddly mesmerizing","Alluring", "Intriguing", "Seductive", "Enchanting", "Curious", "Unique", "Captivating", "Hypnotical", "Strange", "Unconventional", "Dark", "Exquisite", "Fascinating", "Peculiar", "Mysterious", "Eerie", "Compelling", "Haunting", "Bewitching", "Odd", "ominous", "eerie", "haunting", "mysterious", "uncanny", "menacing", "sinister", "grim", "enigmatic", "foreboding", "attractive", "brooding", "cryptic", "troubling", "alluring", "enticing", "portentous", "enchanting", "disquieting", "mesmerizing", "still", "beckoning", "adjective", "strange", "begging", "waiting" , "apealing"};
        Random random = new Random();
        int randomNumber = random.nextInt(deskAdjectives.length);
        String randomAdjective = deskAdjectives[randomNumber];
        System.out.println(randomAdjective);
    count = count+1;
}

    
  }
}
