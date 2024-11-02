# Γεια! Ευχαριστώ για την υπομονή. Θα βρείτε εδώ λεπτομέρειες για ό,τι χρειαστεί.

Η main οθόνη ονομάζεται TriviaApp (στο αρχείο ΤriviaApp.kt) και καλέιται στο mainActivity.
Κάθε οθόνη στον φάκελο screens (StartSceen, QuestionScreen, FinalScreen) έχει 2 composable functions (αγνοήστε τα previews, υπάρχουν μόνο για να βλέπουμε την οθόνη).
H oθόνη TriviaApp καλεί πάντα την μία από τις 2 composable functions, αλλά μπορείτε να το αλλάξετε σε όποια σας αρέσει.

Στον φάκελο components θα βρείτε τα composable functions που είναι τα ίδια Text() & Button() που χρησιμοποιήσαμε, αλλά φτιαγμένα με διαφορετικό στυλ.
πχ. To StylishText απλά καλεί ένα Text με έξτρα αλλαγές αντί να χρειαστεί να γράφουμε όλες τις αλλαγές σε κάθε Text ξεχωριστά.

Αν θέλετε να αφαιρέσετε το background χρώμα, στον φάκελο ui.theme -> Theme και αφαιρείτε το BaseScreen {} προς το τέλος για να μείνει μόνο το content()
Aν θέλετε να αλλάξετε το χρώμα, μπορείτε να πειράξετε το GradientBackground composable στο αρχείο BaseScreen.kt στον φάκελο components.
To BaseScreen κάνει ό,τι και το GradientBackground, μπορεί να αφαιρεθεί για να υπάρχει το GradientBackground απευθείας.

Για ερωτήσεις, στείλτε email. Θα χαρώ να βοηθήσω παραπάνω
