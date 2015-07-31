package com.iamakash.funfacts;

import java.util.Random;

/**
 * Created by akash on 2015-07-18.
 */
public class factBook {

    public String[] mfacts = {
            "Ants stretch when they wake up in the morning.",
            "Ostriches can run faster than horses.",
            "Olympic gold medals are actually made mostly of silver.",
            "You are born with 300 bones; by the time you are an adult you will have 206.",
            "It takes about 8 minutes for light from the Sun to reach Earth.",
            "Some bamboo plants can grow almost a meter in just one day.",
            "The state of Florida is bigger than England.",
            "Some penguins can leap 2-3 meters out of the water.",
            "On average, it takes 66 days to form a new habit.",
            "Mammoths still walked the earth when the Great Pyramid was being built.",
           "When hippos are upset, their sweat turns red." ,
           " Whip makes a cracking sound because its tip moves faster than the speed of sound.",
           "It cost 7 million dollars to build the Titanic and 200 million to make a film about it.",
           "When hippos are upset, their sweat turns red.",
            "Every time you sneeze some of your brain cells die.",
           "Your left lung is smaller than your right lung to make room for your heart.",
           "Laughing lowers levels of stress hormones and strengthens the immune system. ",
           "Six-year-olds laugh an average of 300 times a day. Adults only laugh 15 to 100 times a day.",
          "Chewing gum while peeling onions will keep you from crying.",
          "The Boeing 747 is capable of flying upside-down if it weren’t for the fact that the wings would shear off when trying to roll it over.",
          "never hold your nose and cover your mouth when sneezing, as it can blow out your eyeballs."   ,
          "The world’s smartest pig, owned by a mathematics teacher in Madison, WI, memorized the multiplication tables up to 12.",
           "In ancient Greece, children of wealthy families were dipped in olive oil at birth to keep them hairless throughout their lives.",
            "Every Labrador retriever dreams about bananas once in a while.",
           "Approximately one-sixth of your life is spent on Wednesdays.",
            "You can actually sharpen the blades on a pencil sharpener by wrapping your pencils in aluminum foil before inserting them.",
           "Newborns will be given to the wrong parents daily.",
             "A cockroach can live several weeks with its head cut off.",
          "A company in Taiwan makes dinnerware out of wheat, so you can eat your plate.",
           "A cow produces 200 times more gas a day than a person.",
            " A dime has 118 ridges around the edge.",
             "A dragonfly has a lifespan of 24 hours.",
        "A giraffe can clean its ears with its 21-inch tongue.",
  "A giraffe can go without water longer than a camel can.",
       " A goldfish has a memory span of three seconds.",
       "A pregnant goldfish is called a twit.",
        "  A Saudi Arabian woman can get a divorce if her husband doesn’t give her coffee.",
        " A shark is the only fish that can blink with both eyes.",
        " A quarter has 119 grooves on its edge, a dime has one less groove.",
        " A whale’s penis is called a dork.",
        "America once issued a 5-cent bill.",
        " An iguana can stay under water for 28 minutes.",
        "An ostrich’s eye is bigger than its brain.",
        "Bats always turn left when exiting a cave.",
        " Ben and Jerry’s send the waste from making ice cream to local pig farmers to use as feed. Pigs love the stuff, except for one flavor: Mint Oreo.",
        " Dolphins sleep with one eye open.",
        "Hershey’s Kisses are called that because the machine that makes them looks like it’s kissing the conveyor belt.",
        "If a statue in the park of a person on a horse has both front legs in the air, the person died in battle; if the horse has one front leg in the air, the person died as a result of wounds received in battle; if the horse has all four legs on the ground, the person died of natural causes.",
        "If you toss a penny 10,000 times, it will not be heads 5,000 times, but more like 4,950. The heads picture weighs more, so it ends up on the bottom.",
        "In most advertisements, including newspapers, the time displayed on a watch is 10:10.",
        " It’s impossible to sneeze with your eyes open. (Don’t try this at home!)",
        " More Monopoly money is printed in a year, than real money printed throughout the world.",
        "More people are killed annually by donkeys than die in air crashes.",
        "More people use blue toothbrushes, than red ones.",
        "Mosquitoes have teeth.",
        "Most Americans’ car horns beep in the key of F.",
        "  Most cows give more milk when they listen to music.",
        "Most dust particles in your house are made from dead skin.",
        "Most lipstick contains fish scales.",
        "Over 1000 birds a year die from smashing into windows.",
        " Owls are one of the only birds who can see the color blue.",
        "The average person falls asleep in seven minutes.",
        " The average person has over 1,460 dreams a year.",
        " The average person is about a quarter of an inch taller at night.",
        "The average person’s left hand does 56% of the typing.",
        "The only 15 letter word that can be spelled without repeating a letter is uncopyrightable.",
        " The only nation whose name begins with an “A” but doesn’t end in an “A” is Afghanistan.",
        "The “save” icon on Microsoft Word shows a floppy disk, with the shutter on backwards.",
        "There are 293 ways to make change for a dollar.",
        "There are 336 dimples on a regulation golf ball.",
        "There are over 52.6 million dogs in the U.S.",
        "There are more chickens than people in the world.",
        " There are more plastic flamingos in America than real ones.",
        "There are only four words in the English language which end in “-dous”: tremendous, horrendous, stupendous, and hazardous.",
        "There are only thirteen blimps in the world. Nine of them are in the United States.",
        "When snakes are born with two heads, they fight each other for food.",
        "Windmills always turn counter-clockwise. Except for the windmills in Ireland.",
        "You’re born with 300 bones, but when you get to be an adult, you only have 206.",
        "You’re more likely to get stung by a bee on a windy day than in any other weather.",
        " Windmills always turn counter-clockwise. Except for the windmills in Ireland.",
        "The sound of E.T. walking was made by someone squishing her hands in Jello.",
        "The starfish is one of the only animals who can turn it’s stomach inside-out.",
        "The state of Florida is bigger than England.",
        "The name Wendy was made up for the book “Peter Pan.”",
        "The national anthem of Greece has 158 verses. No one in Greece has memorized all 158 verses.",
        "The Neanderthal’s brain was bigger than yours is.",
        "The oldest known goldfish lived to 41 years of age. Its name was Fred.",
        "The giant squid has the largest eyes in the world.",
        "The glue on Israeli postage stamps is certified kosher.",
        "The highest point in Pennsylvania is lower than the lowest point in Colorado.",
        "The housefly hums in the middle octave, key of F.",
        "The international telephone dialing code for Antarctica is 672.",
        "The katydid bug hears through holes in its hind legs.",
        " The “L.L.” in L.L. Bean stands for Leon Leonwood.",
        " The longest one-syllable word in the English language is “screeched.”",
        "The longest recorded flight of a chicken is thirteen seconds.",
        " The longest word in the English language, according to the Oxford English Dictionary, is pneumonoultramicroscopicsilicovolcanoconiosis. The only other word with the same amount of letters is pneumonoultramicroscopicsilicovolcanoconioses, its plural.",
        " The Main Library at Indiana University sinks over an inch every year because when it was built, engineers failed to take into account the weight of all the books that would occupy the building.",
        " The Boston University Bridge (on Commonwealth Avenue, Boston, Massachusetts) is the only place in the world where a boat can sail under a train driving under a car driving under an airplane.",
        "The characters Bert and Ernie on Sesame Street were named after Bert the cop and Ernie the taxi driver in Frank Capra’s “Its A Wonderful Life”.",
        "The condom – made originally of linen – was invented in the early 1500s.",
        " The cruise liner, Queen Elizabeth II, moves only six inches for each gallon of diesel that it burns.",
        "The Earth weighs around 6,588,000,000,000,000,000,000,000 tons.",
        " The Eisenhower interstate system requires that one mile in every five must be straight. These straight sections are usable as airstrips in times of war or other emergencies.",
        " The electric chair was invented by a dentist.",
        "The elephant is the only mammal that can’t jump.",
        "The first Ford cars had Dodge engines.",


    };
    public String getFact(){

    //button clicked, update with new fact
    String fact = "";
    //randomly select fact
    Random randomGenerator = new Random();
    int randomNumber = randomGenerator.nextInt(mfacts.length);
    fact=mfacts[randomNumber];
    return fact;
    }


}
