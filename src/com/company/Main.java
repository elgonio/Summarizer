/*
    TODO:
    fix the issue with splits on . [this may be caused by punctuation]
 */
package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
	// write your code here
        String s = "The Sherlock team are reuniting on a new version of the classic horror story Dracula, RadioTimes.com can confirm.\n" +
                "Steven Moffat and Mark Gatiss are due to begin work on a series of BBC specials based on the classic 1897 novel by Bram Stoker in which the bloodthirsty count moves from Transylvania to England.\n" +
                "The Corporation is finalising talks with the pair and is poised to green-light the project which is likely to air in 2019.\n" +
                "The new Dracula series has not yet been written and Gatiss and Moffat will begin working on the scripts once they have both completed their own solo projects – details of which have not been confirmed.\n" +
                "Sherlock producer – and Moffat's wife – Sue Vertue will produce Dracula for Sherlock production house Hartswood Films.\n" +
                "“It’s early days and the BBC has not seen a script yet but they are close to signing a deal for a series of 90-minute films of Dracula,” said a senior production source.\n" +
                "“It’s not yet been decided if it will be historical or modern day or if there will be a US co-producer but the BBC are keen on this and it will happen. What needs to be decided is how many episodes – whether there are three or five or six or whatever but they will definitely be 90-minute films.\n" +
                "\"Production is at least a year away so it will probably be on screen in 2019 at the earliest.”\n" +
                "Dracula will be the first collaboration between Moffat and Gatiss since the last Sherlock episode aired in January – and the pair have made no secret of their desire to work together again.\n" +
                "Moffat first revealed his desire to collaborate with Gatiss again post-Sherlock at the Radio Times Covers Party earlier this year, saying: \"That is because I love him\".\n" +
                "Gatiss has often spoken of his fondness for the Dracula story – particularly the 1958 film starring Christopher Lee and Peter Cushing – and even played the title role himself in a recent audio drama, but it currently seems unlikely that he will take on the part of the Count in the new version, according to sources.\n" +
                "“Casting is a long way off but the feeling is he probably won’t – but you never know,” said a BBC source. \n" +
                "The producers will be hoping for more success with this project than the version of Dracula made by Downton Abbey producers Carnival Films in 2013 starring Jonathan Rhys Meyers. The ten-episode run aired on NBC and Sky Living in the UK and was axed after one series.\n" +
                "As for the next series of Sherlock, a production source said: “Sherlock will return when Sherlock returns.”";

        String s1 = "Bug-out bags, self-designed evacuation plans, stockpiles in the garage. Most Americans born in or after the 1970s have probably never thought much about these items. But ever since the Doomsday Clock, which measures how close the world is to a major anthropogenic disaster, was introduced after World War II, the public has kept a nervous eye on the likelihood of nuclear wars. With the cable news cycle’s predictable turn toward semi-obsessive coverage of North Korea and President Trump’s responses to the small nation’s nuclear program, fear has become a fixture in many households. Understandably so, as the Doomsday Clock now indicates the world is the closest it has been to disaster since 1953.\n" +
                "\n" +
                "The urge to protect ourselves and control our fate is natural, but there’s no need to let nuclear angst run our lives. Through thoughtful examination of our nation’s history with nuclear weapons and the anxiety they bring, we can better understand these fears and work to address them.\n" +
                "\n" +
                "\n" +
                "A quick scan of the average social media feed reveals at least a few sardonic comments about how we’re “all going to die” and questions about how to stay safe should the worst happen on US soil. People are scared for a lot of good reasons. Though there are far fewer nuclear weapons in the world than during the 1980s and ’90s, more countries have nuclear weapons today than in previous decades, according to the Bulletin of Atomic Scientists.\n" +
                "\n" +
                "Currently, nine countries including the United States have a nuclear stockpile, for a global total of 14,900 nuclear weapons, according to Ploughshares Fund, a nonprofit organization dedicated to reducing nuclear threats. Russia has 7,000 of the world’s share of nuclear arms, while 6,800 belong to the United States. North Korea, the current epicenter of nuclear angst, reportedly has fewer than 15 as of March 2016.\n" +
                "\n" +
                "But there’s no denying that 14,000 nuclear bombs is still quite a lot. Knowing these weapons exist — combined with the fact that the US military is now helmed by an erratic real estate mogul with no political or military experience — it’s no challenge to understand why people are afraid. But of course these fears have been a part of the fabric of American culture long before president Trump stepped into the White House, and well before North Korea even had a nuclear program. The story of these fears begins at home in the US with the atom bomb.\n" +
                "\n" +
                "After Manhattan Project scientists created and US forces dropped atomic bombs on Hiroshima and Nagasaki in 1945, ending the World War II conflict in Japan, Americans had a surge of confidence about nuclear technology’s potential for good. It was short-lived. In 1946, the Soviet Union began a nuclear program, striking fear into the hearts of civilians and engendering the Soviet-US nuclear arms race. Now, instead of being an exciting prospect, nuclear arms became a threat to the country that invented them.\n" +
                "\n" +
                "At the end of World War II, University of Chicago scientists involved with the Manhattan Project founded the Bulletin of Atomic Scientists, a publication for scientists and the public about nuclear armaments, war, and climate change, among other subjects. In 1947, Bulletin scientists introduced the now iconic Doomsday Clock.\n" +
                "\n" +
                "The Clock measures how near we are to a global, human-caused disaster. Upon its debut, the clock was set to seven minutes to midnight (on the Doomsday Clock, midnight signifies, well, doomsday: total catastrophe). The Doomsday Clock’s hands have moved backward and forward a total of 22 times; it remains one of the most accessible ways for the general public to assess how much danger we’re all in.\n" +
                "\n" +
                "The Doomsday Clock’s hands have moved backward and forward a total of 22 times; it remains one of the most accessible ways for the general public to assess how much danger we’re all in.\n" +
                "The end of World War II ushered in the Cold War, the decades-long period of diplomatic and ideological tensions between the Soviet Union and the United States. The Soviet Union’s growing stash of nuclear weapons was the primary physical threat to the US during the Cold War. This was the era of “duck and cover.” The Doomsday Clock was set to three minutes to midnight in 1949, two minutes in 1953, and seven minutes in 1960. Millennials and Gen-Xers can ask their parents about this: in the 1950s and 60s, school children took part in drills that taught them what to do should the Soviets drop a nuclear bomb. Black and white instructional videos told children that everyone should duck down to the floor and seek cover. Of course, if a nuclear missile were to strike, a school desk over the head of a small child would do absolutely nothing to prevent death, but the drills went on in large part because people felt they had the ability to do something, anything, to control their destiny.\n" +
                "\n" +
                "Throughout the Cold War, nuclear weapons proliferated in pop culture. Godzilla debuted in the United States in 1955, a film broadly understood to be a metaphor for nuclear weapons. The film depicts nuclear weapons as a dangerous, unpredictable, and difficult to defeat monster that terrorizes Japan. It was well-received among American critics and kicked off a long run of movies featuring nuclear themes, including the 1959’s On the Beach, a story about a post-World War III world where Australia is the only continent to survive nuclear blasts. It was the first movie to explore the idea that mankind as a species could be eradicated by nuclear war. On the Beach centers much of its horror plot around radiation, tapping into what makes nuclear bombs so much more frightening than other weapons.\n" +
                "\n" +
                "***\n" +
                "\n" +
                "David Ropeik, a risk management and risk communications consultant and author of the book, How Risky Is It, Really?: Why Our Fears Don’t Always Match the Facts, offers a reminder that nuclear weapons are uniquely scary because of they come with dangers that don’t end with the explosion itself. Radiation poisoning is very dangerous to humans. It can cause cell death, and DNA mutations that can lead to cancer. We fear not only the destruction that nuclear bombs can cause, but the deadly trail of radiation.\n" +
                "\n" +
                "As for pop culture’s role in all of this, we still see end-of-the-world and nuclear themed stories today. North Korea left the Nonproliferation Treaty (NPT) in 2003, and a few years later nuclear plotlines spiked in Hollywood. In 2005, the 60th anniversary of the atom bomb attacks in Japan ushered in the release of several fictional stories about nuclear weapons: Stealth, Black Dawn, and The Last Best Chance. The BBC also released a documentary about Hiroshima that year.\n" +
                "\n" +
                "In 2012’s The Avengers, Iron Man soars through the air to chase down a nuclear missile heading for New York and stops it from destroying the city. But in reality, there’s no Tony Stark to save the day, and the idea that everyday people can protect themselves from nuclear threats is a fantasy. There is no Iron Man — and duck and cover drills were ultimately useless — but as Ropeik explains, humans have a deep desire to feel in control when they’re in danger.\n" +
                "\n" +
                "“You know when you’re on a road trip with a friend, and you start to feel sleepy behind the wheel? Well what happens when you switch to the passenger side and let your friend take over driving?” Ropeik asks. “You’re likely going to be on higher alert, and no longer feel as tired. Out of control of the situation, your mind is on higher alert. You’ll notice your foot moving to a brake pedal that’s not there, and suddenly other cars look too close and it feels like the car is going too fast.”\n" +
                "\n" +
                "This same concept holds true for greater existential fears, like nuclear war. Unable to control what happens, we will seek ways to protect ourselves, stepping on imaginary brakes even when it’s futile. Self-preservation is in our nature, Ropeik says, and we can’t really help but attempt to control some aspect of the uncontrollable.\n" +
                "\n" +
                "Become a Longreads Member to support more stories like this.\n" +
                "\n" +
                "Sign up\n" +
                "\n" +
                "Dr. Debra Kissen, clinical director of the Light on Anxiety Treatment Center in Chicago, says that one of the best ways to manage fears about nuclear war is to limit media consumption, especially when it becomes compulsive. “When it’s to the point where you feel you have to check the news, rather than just being curious about what’s happening in the world,” the updates only provide more fodder for the concern. And if the fears start interfering with everyday life, it’s time to head to therapy.\n" +
                "\n" +
                "Kissen says that cognitive behavioral therapy (CBT) can help with fears over nuclear war. “Imaginary exposure where the patient imagines what it would be like if the world ended,” and repeating the exercise over and over until the image is no longer so devastatingly scary is one method. Another is to work with patients on trigger phrases that they may avoid, such as “nuclear war,” to the point that the phrase itself becomes mundane and unintimidating.\n" +
                "\n" +
                "It’s also of the utmost importance for therapists to help a patient understand the broader fears that underlie the fear of a nuclear event. For many, nuclear dread is closely related to feeling of uncertainty and anxiety around the current political climate in the United States.\n" +
                "\n" +
                "It’s safe to say that today, Donald Trump is the most pressing source of nuclear anxiety in the United States. Trump’s lack of political experience and taunts at North Korea sent many people into a state of fearful dread about the possibility of nuclear war. The Doomsday Clock advanced toward midnight for the first time in two years following Trump’s election, from three to two-and-a-half minutes to midnight.\n" +
                "\n" +
                "Rachel Bronson, Bulletin executive director and publisher, specifically referenced “fake news” in her comment on the Clock’s movement. The Bulletin’s full explainer on the 30-second advancement mentions Donald Trump’s name nine times. In part, this means that the fears concerning the state of America and indeed the planet are justified: the experts on the subject agree that Trump’s presidential campaign worsened these conditions, and that the world is less safe now that he’s in possession of nuclear codes.\n" +
                "\n" +
                "But the fears swirling today do not exist in a vacuum. While Trump and North Korea induce fear in many, the current situation is the result of more than 70 years of a national disposition to fear these weapons.\n" +
                "\n" +
                "In the end, fear is one of many emotions we can’t help but feel, and it is in no way beholden to logic. Like all emotions, fear is valid, and fear is no less valid when its cause is nuclear threat versus tripping and falling on the sidewalk. But it’s not as if we must become victim to our fears; though the fears are natural and legitimate, Kissen explains that we are not helpless against them.\n" +
                "\n" +
                "Ropeik says the level of fear or anxiety individuals experience over the threat of nuclear war has everything to do with what he calls our “emotional libraries,” a mental collection of our past experiences and interactions, good and bad. He says that all of us have a “risk radar screen” always running in our minds, assessing potential danger and alerting us to them.\n" +
                "\n" +
                "For those who have personal experience with events like Chernobyl, or who were around for the Cuban Missile Crisis, news of North Korea’s nuclear testing glows brighter on the risk radar than for someone who has little real-life experience with nuclear weapons. Our fears, whether personal or social, are not simply a pile of historical data points; they’re a reflection of our individual and collective experiences and emotions.\n" +
                "\n" +
                "Calling back to Ropeik’s road trip comparison, our fear peaks when we aren’t in control. And this is where Donald Trump comes in as the ultimate contemporary exacerbator of nuclear fear.\n" +
                "\n" +
                "While North Korea has tested nuclear weapons and made threats for decades (and under numerous presidential administrations) this issue is being closely examined now because people are more worried than they have been in the recent past. Ropeik tells me that because many lack confidence in Trump, people feel even less control over their own and the planet’s safety.\n" +
                "\n" +
                "He adds that the political climate that has had so many people on edge for months also plays a role. “If we feel insecure with the way things are going with politics in general and also feel that the government is not in control, we’re already predisposed to worrying more about nuclear war,” he says.\n" +
                "\n" +
                "***\n" +
                "\n" +
                "The big question, then, is how afraid do we really need to be? There are thousands of nuclear weapons out there in the world, and there’s nothing truly stopping a world leader from launching their nuclear missiles. There’s no denying the dangerous reality of a world where nine countries have nuclear weapons, at least one of which, North Korea, is helmed by a deeply erratic and dangerous leader. All of this is to say: fear is a legitimate response.\n" +
                "\n" +
                "There is such a thing as being too afraid. Ropeik says that if someone finds themselves digging up their backyard to build a fallout shelter, they may want to take a step back and examine how their fears are impacting their lives and those of their families, friends, and neighbors. The threat of a nuclear event is real, but it’s not quite so likely that anyone needs to pull out the old duck-and-cover tutorials or scope out remote caves in which to take up residence. Keeping fear in proportion to the actual threat, by limiting news intake and possibly seeking professional help, is necessary for emotional survival.\n" +
                "\n" +
                "It may help to put things in perspective. Most of the existential fear today comes from concerns over North Korea, but the reality is that North Korea’s farthest-reaching nuclear missile can reach only as far as Guam, according to Al Jazeera. By air travel, Guam is 3,958 miles from Hawai’i, and 6,086 miles from Los Angeles. These figures hopefully prompt a sigh of relief among Americans who fear that nukes could come barreling down from the sky at any moment. (However, it should also make us more sensitive to the threat facing South Korea and Japan, nations that are within reach of and not friends with North Korea.)\n" +
                "\n" +
                "In fact, in 2012, Foreign Policy ranked both Russia and China above North Korea as existential threats to the United States. While Russia can be considered a bad actor and there’s ample political drama unfolding between Russia and the US, there’s no reason to believe that the Kremlin is eager to attack the US with a nuclear weapon. The same holds true for China.\n" +
                "\n" +
                "The fear of nuclear weapons is biological, psychological, and socio-historical all at once. Our minds have evolved to be on alert for that which may harm us, and our culture has spent decades immersed in anxious explorations of nuclear weapons. As long as nuclear weapons exist, there’s cause to fear them, but how afraid we are as we go about our lives is largely within our control —  though it may take some cognitive behavior therapy to get there.";
        summarize(s1);
    }

    private static void summarize(String text)
    {
        int reduction_factor = 10;
        ArrayList<String> output = new ArrayList<String>();
        HashMap<String, Integer> sentences = calculate_scores(text);
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(Map.Entry entry: sentences.entrySet())
        {
            numbers.add((int)entry.getValue());
        }
        Collections.sort(numbers);
        int limit = numbers.get(numbers.size() - (numbers.size()/reduction_factor));

        /*
        debugging stuuf
        System.out.println("numbers size: " + String.valueOf(numbers.size()));
        System.out.println("sentences size: " + String.valueOf(sentences.size()));
        */

        for(Map.Entry entry: sentences.entrySet())
        {
            if ((int)entry.getValue() > limit)
            {
                output.add((String)entry.getKey());
            }
        }

        System.out.println("output size: " + String.valueOf(output.size()));
        for(String s : output)
        {
            System.out.println(s);
        }

    }

    private static HashMap<String,Integer> calculate_scores(String text)
    {
        String[] raw_sentences = text.split("(?<=\\b[.!?\\n])\\s+");
        System.out.println("raw_sentences size: " + String.valueOf(raw_sentences.length));
        HashMap<String,Integer> sentences = new HashMap<String, Integer>();
        HashMap<String,Integer> phrases_scores = getKeyWords_map(text);

        // this block calculates the scores of each sentence and stores them
        int counter = 0;
        for (String sentence : raw_sentences)
        {
            counter = counter+1;
            int score = 0;
            ArrayList<String> sentence_phrases = getAllPhrases(sentence);

            for (String phrase: sentence_phrases)
            {
                //System.out.println("searching for phrase: " + phrase);
                try {
                    score = score + phrases_scores.get(phrase);
                }catch (Exception e)
                {
                    //System.out.println("whoops");
                }

            }

            sentences.put(sentence,score);
            //System.out.println("calculating: " + String.valueOf(((float) counter/raw_sentences.length)*100) + "%");
        }

        return sentences;
    }

    private static ArrayList<String> getAllPhrases(String text)
    {
        String[] words = text.split(" ");
        ArrayList<String> phrases = new ArrayList<String>();

        for (int v = 0 ; v < words.length; v++)
        {
            phrases.addAll(generate_n_word_phrases(v,text));
        }

        return phrases;
    }

    private static ArrayList<String> generate_n_word_phrases(int n, String text)
    {
        String[] words = text.split(" ");

        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i <= words.length-n; i++)
        {
            StringBuilder phrase = new StringBuilder();
            for (int k = 0 ; k < n ; k++)
            {
                phrase = phrase.append(" " + words[i+k]) ;
            }

            if (!phrase.toString().trim().equals(""))
            {
                result.add(phrase.toString());
            }
        }

        return result;
    }

    private static HashMap<String, Integer> getKeyWords_map(String text)
    {
        String[] words = text.split(" ");
        HashMap<String, Integer> phrases = new HashMap<String, Integer>();

        for (int v = 0 ; v < words.length; v++)
        {
            phrases.putAll(generate_n_word_phrases_map(v,text));
            //System.out.println("phrase_generation: " + String.valueOf(((double)v/words.length)*100) + "%");
        }

        return phrases;
    }

    private static HashMap<String, Integer> generate_n_word_phrases_map(int n, String text)
    {
        String[] words = text.split(" ");
        HashMap<String, Integer> result = new HashMap<String, Integer>();

        // a little heuristic/hack to improve performance
        // it is assumed that any phrase longer than 10 words is insignificant
        // thus to dramtically improve performance they are ignored
        if (n>10)
        {
            return result;
        }


        for (int i = 0; i <= words.length-n; i++)
        {
            StringBuilder phrase = new StringBuilder();
            for (int k = 0 ; k < n ; k++)
            {
                phrase.append(" ") ;
                phrase.append(words[i+k]) ;
            }

            if (!phrase.toString().trim().equals(""))
            {
                if (result.containsKey(phrase.toString()))
                {
                    result.put(phrase.toString(),result.get(phrase.toString()) + 1);
                }else
                {
                    result.put(phrase.toString(),1);
                }
            }
            //System.out.println("generation: " + String.valueOf(((double)i/p)*100)  + "%");
        }

        return result;
    }
}
