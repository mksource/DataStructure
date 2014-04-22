package com.ds.utils;

public class UnderflowException extends RuntimeException
{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Construct this exception object.
     * @param message the error message.
     */
    public UnderflowException( String message )
    {
        super( message );
    }
}
