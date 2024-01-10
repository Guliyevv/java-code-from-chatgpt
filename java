function exampleFunction(requiredArgument) {
    // Check if the required argument is provided
    if (typeof requiredArgument === 'undefined') {
        // If not provided, throw an error
        throw new Error('Missing required argument');
    }

    // Rest of the function logic here
    console.log('The required argument is:', requiredArgument);
}

// Example usage
try {
    // This will run successfully
    exampleFunction('Hello, World!');
    
    // This will throw an error since the argument is missing
    // Uncomment the line below to see the error
    // exampleFunction();
} catch (error) {
    console.error('Error:', error.message);
}
